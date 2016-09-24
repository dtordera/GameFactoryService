
package com.dvtrsc.games.test;

import com.dvtrsc.games.mazeescape.Maze;


public class MazeTest
{
	public static void main(String args[])
	{
		Maze M = new Maze(20,20);	
		System.out.println(M.toBinString());
	}
}
