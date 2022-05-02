package com.github.kastkest.algorithms.hw7;

public class Main {
    public static void main(String[] args) {
        test();

    }



    private static void test() {
        Graph graph = new GraphImpl(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdge("Тула", "Липецк", "Воронеж");
        graph.addEdge("Рязань", "Тамбов", "Саратов", "Воронеж");
        graph.addEdge("Калуга", "Орел", "Курск", "Воронеж");

        graph.display();
        System.out.println(graph.getSize());

        graph.dfs("Москва");
    }


}
