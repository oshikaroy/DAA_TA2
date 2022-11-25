# DAA_TA2
```
ROLL NO: 09
NAME: OSHIKA ROY
COURSE: DESIGN ALGORITHM & ANALYSIS
SEMESTER: V
```
*AIM:*

Generate a random number “n” between [5-10], create a matrix of size [n]x[n].Populate the locations with “0” and “1” [the self-loops should be avoided]
Write the program to check and declare:

a) Complete graph is cyclic

b) Part of the graph is cyclic

c) Write the cycle in terms of vertices.

Constraint: the cycle should be of minimum THREE vertices or MAXIMUM “n” vertices.
<hr>

<h2>Logic:</h2>
As a result, we first evaluate if the given graph is cyclic or not using using the Hamiltonian cycle detection method, and then we compute all potential subgraphs of that matrix and submit each matrix for analysis using the Hamiltonian algorithm to determine whether a cycle occurs or not.<br>
<h2>Test cases:</h2>

<h3><em>Test case 1</em></h3>
<div>
<p>Number of vertex: 6</p> 
<p>Adjacency matrix:
<table>
<tr><td>0</td><td>1</td><td>1</td><td>1</td><td>0</td><td>0</td></tr>
<tr><td>1</td><td>0</td><td>0</td><td>1</td><td>0</td><td>1</td></tr>
<tr><td>1</td><td>0</td><td>0</td><td>1</td><td>1</td><td>0</td></tr>
<tr><td>1</td><td>1</td><td>1</td><td>0</td><td>1</td><td>1</td></tr>
<tr><td>0</td><td>0</td><td>0</td><td>1</td><td>0</td><td>1</td></tr>
<tr><td>0</td><td>1</td><td>1</td><td>1</td><td>1</td><td>0</td></tr>
</table>


![6x6 Matrix](https://user-images.githubusercontent.com/98506038/204037479-8627612e-b8e0-473e-87a8-9c90b21ef4f8.png)
<br>
Output:
<br>
Cycle between 0-->1-->3 exists<br>
Cycle between 0-->2-->3 exists<br>
Cycle between 1-->5-->3 exists<br>
Cycle between 5-->4-->3 exists<br>
<hr>

<h3><em>Test case 2</em></h3>
<div>
<p>Number of vertex: 5</p> 
<p>Adjacency matrix:
<table>
<tr><td>0</td><td>1</td><td>1</td><td>1</td><td>0</td><td>0</td></tr>
<tr><td>1</td><td>0</td><td>0</td><td>1</td><td>0</td><td>1</td></tr>
<tr><td>1</td><td>0</td><td>0</td><td>1</td><td>1</td><td>0</td></tr>
<tr><td>1</td><td>1</td><td>1</td><td>0</td><td>1</td><td>1</td></tr>
<tr><td>0</td><td>0</td><td>0</td><td>1</td><td>0</td><td>1</td></tr>
<tr><td>0</td><td>1</td><td>1</td><td>1</td><td>1</td><td>0</td></tr>
</table>

![4x4 Matrix](https://user-images.githubusercontent.com/98506038/204039189-82f4f663-09c0-4e03-bedd-cdbae2716a6e.png)

<br>
No cycle
<hr>


