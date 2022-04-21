# Station and states problem

In that package a problem where you need choose the best combination if stations with a 
given specific set of states or with a given count of stations are resolving with help 
of greedy algorithm.

StationsAndStates - set of stations with maximum cover \
StationsAndStatesWithGivenStates - max optimal set of stations with best cover of given stations 

The greedy algorithm for maximum coverage chooses sets according to one rule: at each stage, choose a set which contains the largest number of uncovered elements (in StationsAndStatesWithNeededStates->chooseStations method). 

The problem has taken from the book "Grokking Algorithms. An Illustrated Guide For 
Programmers And Other Curiours People"