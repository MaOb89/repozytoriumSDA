package Grafy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ZnajdowanieSciezkiDFS {
    public static void main(String[] args) throws FileNotFoundException {
        ZnajdowanieSciezkiDFS znajdowanieSciezkiDFS = new ZnajdowanieSciezkiDFS();
        znajdowanieSciezkiDFS.znajdzSciezke();
    }

    private HashMap<Integer, ArrayList<Integer>> graf;
    private Stack<Integer> S = new Stack<>();
    private boolean[] visited;
    private int vk = -1;
    private int vs = -1;

    public void znajdzSciezke() throws FileNotFoundException {
        parse();
        if(DFS(vs)){
            while (!S.empty()){
                System.out.println(S.pop());
            }
        }
        else {
            System.out.println("BRAK Ścieżki");
        }
    }

    private void parse() throws FileNotFoundException {
        File in = new File("./src/Grafy/Files/input.in");
        Scanner sc = new Scanner(in);

        String[] firstLine = sc.nextLine().split(" "); //tutaj liczba wierzchołków i krawędzi
        int amountOfVertex = Integer.parseInt(firstLine[0]);
        int amountOfEdges = Integer.parseInt(firstLine[1]);

        visited = new boolean[amountOfVertex];

        graf = new HashMap<>();

        int edgesCounter = 0;
        for (int i = 0; i < amountOfVertex; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < line.length; j+=2) {
                int key = Integer.parseInt(line[j]);
                int value = Integer.parseInt(line[j+1]);
                if (!graf.containsKey(key)) {
                    graf.put(key, new ArrayList<>());
                }

                graf.get(key).add(value);
            }
        }
        vs = Integer.parseInt(sc.nextLine());
        vk = Integer.parseInt(sc.nextLine());
    }

    public boolean DFS(int currentVertex){
        visited[currentVertex] = true;
        S.push(currentVertex);

        if(currentVertex == vk){
            return true;
        }

        ArrayList<Integer> sasiedzi = graf.get(currentVertex);

        for (int i = 0; i < sasiedzi.size(); i++) {
            if(visited[sasiedzi.get(i)]){
                continue;
            }
            if(DFS(sasiedzi.get(i))){
                return true;
            }
        }

        S.pop();
        return false;
    }
}