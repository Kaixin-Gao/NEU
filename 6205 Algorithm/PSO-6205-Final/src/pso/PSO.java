package pso;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PSO {

    @SuppressWarnings("resource")
    private int bestNum;
    private float w;
    private int runtimes;
    private int agentNum;
    private int packagedestinationNum; 
    private int t;
    private int[][] distance; 
    private int[][] particals;// agents' path
    private ArrayList<ArrayList<SO>> listV;
    static int[][] packageDestinationLocation;//HUA TU YONG
    static int[][] path;
    static int count=0;
    private int[][] localbest;// a best solution in the histroy of one agent
    private int[] vlocalbest;// fitness of the local solution
    private int[] globalbest;// best solution among all agents' history
    private int vglobalbest;// fitness of the best global solution
    private int bestT;
    private int[] fitness;
    private Random random;
    
    
    /*public static void main(String[] args) throws IOException {
        // private int[] packagedest;

        System.out.println("Start....");
        PackageDest abc = new PackageDest();
        int[] z = abc.inputDest();
        PSO pso = new PSO(z.length, 10, 35, 0.5f);
        pso.init2("src/data.txt", z);
        pso.solve();
    }*/
    public static void go(int[] z) throws IOException{
        System.out.println("Start....");
        PSO pso = new PSO(z.length, 10, 35, 0.5f);
        pso.ReadData("src/GeneratedData/PackageDest.txt", z);
        pso.start();
    }
    
    public static int[][] go1(){
        return packageDestinationLocation;
    }
    
    public static int[][] go2(){
        return path;
    }

    public void ReadData(String str, int[] z) throws IOException {
        
        distance = new int[packagedestinationNum][packagedestinationNum];
        int[] x;
        int[] y;
        String strbuff;
        x = new int[packagedestinationNum];
        y = new int[packagedestinationNum];
        packageDestinationLocation = new int[packagedestinationNum][2];
        path = new int[5][packagedestinationNum];

        for (int i = 0; i < packagedestinationNum; i++) {// read lines
            BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            for (int read = 0; read < 34; read++) {
                strbuff = data.readLine();// cut string
                String[] strcol = strbuff.split(" ");
                if (Integer.valueOf(strcol[0]) == z[i]) {
                    x[i] = Integer.valueOf(strcol[1]);
                    y[i] = Integer.valueOf(strcol[2]);
                    packageDestinationLocation[i][0] = Integer.valueOf(strcol[1]);
                    packageDestinationLocation[i][1] = Integer.valueOf(strcol[2]);
                }
            }
        }
        
        for (int i = 0; i < packagedestinationNum - 1; i++) {
            distance[i][i] = 0; 
            for (int j = i + 1; j < packagedestinationNum; j++) {
                double rij = Math.sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j])
                        * (y[i] - y[j])) / 10.0);
                int tij = (int) Math.round(rij);
                if (tij < rij) {
                    distance[i][j] = tij + 1;
                    distance[j][i] = distance[i][j];
                } else {
                    distance[i][j] = tij;
                    distance[j][i] = distance[i][j];
                }
            }
        }
        distance[packagedestinationNum - 1][packagedestinationNum - 1] = 0;
        particals = new int[agentNum][packagedestinationNum];
        fitness = new int[agentNum];
        localbest = new int[agentNum][packagedestinationNum];
        vlocalbest = new int[agentNum];
        globalbest = new int[packagedestinationNum];
        vglobalbest = Integer.MAX_VALUE;

        bestT = 0;
        t = 0;
        random = new Random(System.currentTimeMillis());//use a different seed for every run 

    }
    
    public void start() {
        int i;
        int k;

        initAgents();
        initListV();

        copyarray(particals, localbest);

        for (k = 0; k < agentNum; k++) {
            fitness[k] = CalculateFitness(particals[k]);
            vlocalbest[k] = fitness[k];
            if (vglobalbest > vlocalbest[k]) {
                vglobalbest = vlocalbest[k];
                copyarrayNum(localbest[k], globalbest);
                bestNum = k;
            }
        }

        System.out.println("initialize particals ...");
        for (k = 0; k < agentNum; k++) {
            System.out.print("Agent: " + k + "    Path");
            for (i = 0; i < packagedestinationNum; i++) {

                System.out.print(particals[k][i] + ",");
            }
            System.out.println("     fitness = " + fitness[k]);

        }
        iteration();
        System.out.println("\nlast state of particals ...");
        for (k = 0; k < agentNum; k++) {
            System.out.print("Agent: " + k + "    Path");
            for (i = 0; i < packagedestinationNum; i++) {
                System.out.print(particals[k][i] + ",");
            }
            System.out.println("     fitness = " + fitness[k]);

        }
        System.out.println();
        System.out.print("first best fitness appear in:   ");
        System.out.println(bestT);
        System.out.print("best fitness length:   ");
        System.out.println(vglobalbest);
        System.out.print("best path:   ");
        for (i = 0; i < packagedestinationNum; i++) {
            System.out.print(globalbest[i] + ",");
            path[4][i]=globalbest[i];
        }
        System.out.println();
        //return  packageDestinationLocation;
    }

    void initAgents() {
        int i, j, k;
        for (k = 0; k < agentNum; k++)
        {
            particals[k][0] = random.nextInt(65535) % packagedestinationNum;//random 0-(packagedestinationNum-1)
            for (i = 1; i < packagedestinationNum;)
            {
                particals[k][i] = random.nextInt(65535) % packagedestinationNum;
                for (j = 0; j < i; j++) {
                    if (particals[k][i] == particals[k][j]) {
                        break;
                    }
                }
                if (j == i) {
                    i++;
                }
            }
        }
        for(int a = 0; a<4;a++){
            for(int b=0;b<8;b++){
                path[a][b]=particals[a][b];
            }
    }
    }

    void initListV() {
        int ra;
        int raA;
        int raB;

        listV = new ArrayList<ArrayList<SO>>();

        for (int i = 0; i < agentNum; i++) {
            ArrayList<SO> list = new ArrayList<SO>();
            ra = random.nextInt(65535) % packagedestinationNum;
            for (int j = 0; j < ra; j++) {
                raA = random.nextInt(65535) % packagedestinationNum;
                raB = random.nextInt(65535) % packagedestinationNum;
                while (raA == raB) {
                    raB = random.nextInt(65535) % packagedestinationNum;
                }
                SO s = new SO(raA, raB);
                list.add(s);
            }

            listV.add(list);
        }
    }

    public int CalculateFitness(int[] chr) {
        int len = 0;
        for (int i = 1; i < packagedestinationNum; i++) {
            len += distance[chr[i - 1]][chr[i]];
        }
        len += distance[chr[packagedestinationNum - 1]][chr[0]];
        return len;
    }

    public void updateV(int i) {
        int j;
        int len = 0;
        float ra = 0f;
        ArrayList<SO> Vi;

        ArrayList<SO> Vii = new ArrayList<SO>();
        Vi = listV.get(i);
        len = (int) (Vi.size() * w);
        for (j = 0; j < len; j++) {
            Vii.add(Vi.get(j));
        }
        ArrayList<SO> a = minus(localbest[i], particals[i]);

        ra = random.nextFloat();
        len = (int) (a.size() * ra);
        for (j = 0; j < len; j++) {
            Vii.add(a.get(j));
        }
        ArrayList<SO> b = minus(globalbest, particals[i]);
        ra = random.nextFloat();
        len = (int) (b.size() * ra);
        for (j = 0; j < len; j++) {
            SO tt = b.get(j);
            Vii.add(tt);
        }
        listV.add(i, Vii);
        add(particals[i], Vii);

    }

    public void updateFitness(int k) {

        fitness[k] = CalculateFitness(particals[k]);
        if (vlocalbest[k] > fitness[k]) {
            vlocalbest[k] = fitness[k];
            copyarrayNum(particals[k], localbest[k]);
            bestNum = k;
        }
        if (vglobalbest > vlocalbest[k]) {
            
            System.out.println("\nnew better fitness found!");
            System.out.println("best fitness length: " + vglobalbest + " \n running times：" + bestT);
            System.out.print("Agent: " + k + "    Path");
             for (int i1 = 0; i1 < packagedestinationNum; i1++) {
                System.out.print(particals[k][i1] + ",");
                if(count<4){
                    path[count][i1]=particals[k][i1];
                }
            }
            count++;
            System.out.println();
            System.out.println();
            bestT = t;
            vglobalbest = vlocalbest[k];
            copyarrayNum(localbest[k], globalbest);
        }
    }

    public class timerTsk extends TimerTask {

        private int id;
        public timerTsk(int id) {
            this.id = id;
        }
                              //  int[][] n= new int [35][2];
        @Override
        public void run() {
            System.out.println("Thread" + id + ":  now running");
            updateV(id);
            updateFitness(id);
                             //  if(t1==runtimes) 
                             //   {timer.cancel();}
        }
    }

    public void process() {
        timerTsk[] tsk = new timerTsk[agentNum];
        Timer timer = new Timer();
        for (int i = 0; i < agentNum; i++) {
            tsk[i] = new timerTsk(i);
            timer.schedule(tsk[i], 0, 500);
            
        }
        Thread  thread = new Thread();
        try{
            thread.sleep(runtimes*500);
            
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        timer.cancel();
        /*while (true) { //stop
            System.out.println(t1);
                if (t1>=(runtimes*agentNum)) {
                    timer.cancel();
                } // TODO Auto-generated catch block
            }*/
    }
  
    public void iteration() {
        /* int i, j, k;
        int len = 0;
        float ra = 0f;

        ArrayList<SO> Vi;*/

      //  for (t = 0; t < runtimes; t++) {
           // for (int i = 0; i < agentNum; i++) {
             //   if (i == bestNum) {
              //      continue;
              //  }
                process();
          //  }
            for (int k = 0; k < agentNum; k++) {
                updateFitness(k);
            }
       // }
    }

    

    
    
    
    
    
    
    
    
    
    public void add(int[] arr, ArrayList<SO> list) {
        int temp = -1;
        SO s;
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            temp = arr[s.getX()];
            arr[s.getX()] = arr[s.getY()];
            arr[s.getY()] = temp;
        }
    }
    
    public void evo() {
		int i, j, k;
		int len = 0;
		float ra = 0f;
		ArrayList<SO> Vi;
		for (t = 0; t < runtimes; t++) {
			for (i = 0; i < runtimes; i++) {
				if(i==bestNum) continue;
				ArrayList<SO> Vii = new ArrayList<SO>();
				Vi = listV.get(i);
				len = (int) (Vi.size() * w);
				for (j = 0; j < len; j++) {
					Vii.add(Vi.get(j));
				}
				ArrayList<SO> a = minus(localbest[i], particals[i]);
				ra = random.nextFloat();
				len = (int) (a.size() * ra);
				for (j = 0; j < len; j++) {
					Vii.add(a.get(j));
				}
				ArrayList<SO> b = minus(globalbest, particals[i]);
				ra = random.nextFloat();
				len = (int) (b.size() * ra);
				for (j = 0; j < len; j++) {
					SO tt= b.get(j);
					Vii.add(tt);
				}
				listV.add(i, Vii);
				add(particals[i], Vii);
			}
			for (k = 0; k < runtimes; k++) {
				fitness[k] = CalculateFitness(particals[k]);
				if (vlocalbest[k] > fitness[k]) {
					vlocalbest[k] = fitness[k];
					copyarrayNum(particals[k], localbest[k]);
					bestNum=k;
				}
				if (vglobalbest > vlocalbest[k]) {
					System.out.println("最佳长度"+vglobalbest+" 代数："+bestT);
					bestT = t;
					vglobalbest = vlocalbest[k];
					copyarrayNum(localbest[k], globalbest);
                                       
				}
			}
		}
	}
    
    public PSO(int n, int g, int s, float w) {
        this.packagedestinationNum = n;//package number
        this.runtimes = g;
        this.agentNum = s;//agent number
        this.w = w;//weight
    }

    public ArrayList<SO> minus(int[] a, int[] b) {
        int[] temp = b.clone();
        int index;
        // 交换子
        SO s;
        // 交换序列
        ArrayList<SO> list = new ArrayList<SO>();
        for (int i = 0; i < packagedestinationNum; i++) {
            if (a[i] != temp[i]) {
                index = findNum(temp, a[i]);
                changeIndex(temp, i, index);
                s = new SO(i, index);
                list.add(s);
            }
        }
        return list;
    }

    public int findNum(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < packagedestinationNum; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void changeIndex(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void copyarray(int[][] from, int[][] to) {
        for (int i = 0; i < agentNum; i++) {
            for (int j = 0; j < packagedestinationNum; j++) {
                to[i][j] = from[i][j];
            }
        }
    }

    public void copyarrayNum(int[] from, int[] to) {
        for (int i = 0; i < packagedestinationNum; i++) {
            to[i] = from[i];
        }
    }

}
