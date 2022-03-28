package graph;

/*
Determine the minimum cost to provide library access to all citizens of HackerLand. There are  cities numbered from  to . Currently there are no libraries and the cities are not connected. Bidirectional roads may be built between any city pair listed in . A citizen has access to a library if:
Their city contains a library.
They can travel by road from their city to a city containing a library.

https://www.hackerrank.com/challenges/torque-and-development/problem?isFullScreen=true
*/

import java.util.*;
import java.util.stream.Collectors;

public class RoadsAndLibraries {


    public static void main(String[] args) {
        List<List<Integer>> cities = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 1), Arrays.asList(2, 3));
        System.out.println(RoadsAndLibraries.roadsAndLibraries(3, 2, 1, cities));
    }

    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
        System.out.println("Result.roadsAndLibraries()");
        Map<Integer, City> cityMap = getListOfCities(cities);
        CityGraph graph = new CityGraph(cityMap);

        for (List<Integer> edge : cities) {
            graph.addUndirectedEdgeToList(edge.get(0), edge.get(1));
        }

        return 1;
    }

    private static Map<Integer, City> getListOfCities(List<List<Integer>> cities) {
        Map<Integer, City> cityMap = new HashMap<>();
        Set<Integer> flat = cities.stream().flatMap(List::stream).collect(Collectors.toSet());
        int index = 0;
        for (Integer item : flat) {
            cityMap.put(item, new City(String.valueOf(item), index++));
        }
        return cityMap;
    }

    static class City {
        String name;
        int index;
        List<City> neighbours = new ArrayList<>();

        public City(String name, int index) {
            this.name = name;
            this.index = index;
        }
    }

    static class CityGraph {
        Map<Integer, City> cityMap;

        public CityGraph(Map<Integer, City> cityMap) {
            this.cityMap = cityMap;
        }

        public void addUndirectedEdgeToList(int i, int j) {
            City first = cityMap.get(i);
            City second = cityMap.get(j);

            first.neighbours.add(second);
            second.neighbours.add(first);
        }

    }
}
