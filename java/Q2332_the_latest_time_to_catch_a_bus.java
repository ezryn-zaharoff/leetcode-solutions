/*
 * Difficulty Level: MEDIUM
 * 
 * You are given a 0-indexed integer array buses of length n, where buses[i] represents the departure time of the ith bus.
 * You are also given a 0-indexed integer array passengers of length m, where passengers[j] represents the arrival time of the jth passenger.
 * All bus departure times are unique.
 * All passenger arrival times are unique.
 * 
 * You are given an integer capacity, which represents the maximum number of passengers that can get on each bus.
 * 
 * When a passenger arrives, they will wait in line for the next available bus.
 * You can get on a bus that departs at x minutes if you arrive at y minutes where y <= x, and the bus is not full.
 * Passengers with the earliest arrival times get on the bus first.
 * 
 * More formally when a bus arrives, either:
 * 
 * • If capacity or fewer passengers are waiting for a bus, they will all get on the bus, or
 * • The capacity passengers with the earliest arrival times will get on the bus.
 * 
 * Return the latest time you may arrive at the bus station to catch a bus.
 * You cannot arrive at the same time as another passenger.
 * 
 * Note: The arrays buses and passengers are not necessarily sorted.
 * 
 */

import java.util.Arrays;

public class Q2332_the_latest_time_to_catch_a_bus {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int index = 0;
        int latest = 0;

        for (int i = 0; i < buses.length; i++) {
            int cap = capacity;
            while (cap > 0 && index < passengers.length && passengers[index] <= buses[i]) {
                cap--;
                index++;
            }

            if (i == buses.length - 1) {
                if (cap > 0) latest = buses[i];
                else latest = passengers[index - 1];

                for (int j = index - 1; j >= 0; j--) {
                    if (latest ==  passengers[j]) latest--;
                    else break;
                }
            }
        }

        return latest;
    }
}
