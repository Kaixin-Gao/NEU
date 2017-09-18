package info6205Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * PSO算法实现
 * 
 * @author mrpod2g
 *
 */
public class Path {

	private static int[] gbest;// 全局最优位置

	private static double gbest_fitness = Double.MAX_VALUE;// 全局最优位置对应的fitness

	private static int particle_num = 50;// 粒子数

	private static int N = 500;// 迭代次数

	private static int c1, c2 = 2;

	private static double w = 0.9;// 惯性因子

	private static List<Particle> particles = new ArrayList<Particle>();// 粒子群

	/**
	 * 初始化所有粒子
	 */
	public static void initialParticles() {
		for (int i = 0; i < particle_num; i++) {
			Particle particle = new Particle();
			particle.initialX();
			particle.initialV();
			particle.fitness = particle.calculateFitness();
			particles.add(particle);
		}

	}

	/**
	 * update gbest
	 */
	public static void updateGbest() {
		double fitness = Double.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < particle_num; i++) {
			if (particles.get(i).fitness < fitness) {
				index = i;
				fitness = particles.get(i).fitness;
			}
		}
		if (fitness < gbest_fitness) {
			gbest = particles.get(index).pbest.clone();
			gbest_fitness = fitness;
		}
	}

	/**
	 * 跟新每个粒子的速度
	 */
	public static void updateV() {
		for (Particle particle : particles) {
			for (int i = 0; i < particle.dimension; i++) {
				double v = w * particle.V[i] + c1 * rand() * (particle.pbest[i] - particle.X[i])
						+ c2 * rand() * (gbest[i] - particle.X[i]);
				if (v > particle.Vmax)
					v = particle.Vmax;
				else if (v < -particle.Vmax)
					v = -particle.Vmax;
				particle.V[i] = v;// 更新Vi
			}
		}
	}

	/**
	 * 更新每个粒子的位置和pbest
	 */
	public static void updateX() {
		for (Particle particle : particles) {
			for (int i = 0; i < particle.dimension; i++) {
				int temp = (int) (particle.X[i] + particle.V[i]);
				if(temp > 19)
				particle.X[i] = 19;
				else if (temp < 0) particle.X[i] = 0;
				else particle.X[i] = temp;
			}
			double newFitness = particle.calculateFitness();// 新的适应值
			// 如果新的适应值比原来的小则跟新fitness和pbest
			if (newFitness < particle.fitness) {
				particle.pbest = particle.X.clone();
				particle.fitness = newFitness;
			}
		}
	}

	/**
	 * 算法主要流程
	 */
	public static void process() {
		int n = 0;
		initialParticles();
		updateGbest();
		while (n++ < N) {
			w = (w - (0.7/N*n));
			updateV();
			updateX();
			updateGbest();
			System.out.println(n + ".当前gbest:");
			System.out.println(Arrays.toString(gbest));
			System.out.println("fitness=" + gbest_fitness);
		}
	}

	/**
	 * 返回一个0~1的随机数
	 * 
	 * @return
	 */
	public static double rand() {
		return new Random().nextDouble();
	}

	public static void main(String[] args) {
		process();
	}

}
