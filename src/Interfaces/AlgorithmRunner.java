package Interfaces;

public class AlgorithmRunner {
	public static void main(String[] args) {
		ComplexAlogrithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(110, 20));
	}

}
