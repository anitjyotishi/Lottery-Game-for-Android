package com.example.hm5_gokani_jyotishi;

// 4-sided cube
public class Spinner extends Mesh {
	public Spinner(float width, float height, float depth) {

        width  /= 2;
		height /= 2;
		float heightSecond = height/2;
		float sin60= (float)Math.sin(Math.PI/3);
		depth = sin60 * height;
		System.out.println("height "+ height + "Width "+sin60);

 
        float vertices[] = {

				-width,-heightSecond,depth,
				width,-heightSecond,depth,
				width,heightSecond,depth,
				-width,heightSecond,depth,

				-width,heightSecond,depth,
				width,heightSecond,depth,
				width,height,0f,
				-width,height , 0f,

				-width,height , 0f,
				width,height , 0f,
				width,heightSecond,-depth,
				-width,heightSecond,-depth,

				-width,heightSecond,-depth,
				width,heightSecond,-depth,
				width,-heightSecond,-depth,
				-width,-heightSecond,-depth,

				-width,-heightSecond,-depth,
				width,-heightSecond,-depth,
				width,-height,0f,
				-width,-height,0f,

				-width,-height,0f,
				width,-height,0f,
				width,-heightSecond,depth,
				-width,-heightSecond,depth,

		};

        short indices[] = {
				0,1,2,
				0,2,3,       // face 1

				4,5,6,
				4,6,7,       // face 2

				8,9,10,
				8,10,11,     // face 3

				12,13,14,
				12,14,15,    // face 4

				16,17,18,
				16,18,19,     // face 5

				20,21,22,       //face 6
				20,22,23
        };

		float textureCoordinates[] = {

				0.0f, 0.33f,    // vertex [3]
				0.33f, 0.33f,    // vertex [2]
				0.33f, 0.0f,    // vertex [1]
				0.0f, 0.0f,      // vertex [0]

				0.33f, 0.33f,   // vertex [7]
				0.66f, 0.33f,   // vertex [6]
				0.66f, 0.0f,    // vertex [5]
				0.33f, 0.0f,    // vertex [4]

				0.0f, 0.66f,   // vertex [11]
				0.33f, 0.66f,  // vertex [10]
				0.33f, 0.33f,  // vertex [9]
				0.0f, 0.33f,   // vertex [8]

				0.33f, 0.66f,  // vertex [15]
				0.66f, 0.66f,  // vertex [14]
				0.66f, 0.33f,  // vertex [13]
				0.33f, 0.33f,  // vertex [12]

				0.0f, 1.0f,    // vertex [19]
				0.33f, 1.0f,   // vertex [18]
				0.33f, 0.66f,  // vertex [17]
				0.0f, 0.66f,   // vertex [16]

				0.33f,1.0f,	//vertex [23]
				0.66f,1.0f,	//vertex [22]
				0.66f,0.66f,//vertex [21]
				0.33f,0.66f,//vertex [20]

		};   
        
	    setIndices(indices);
        setVertices(vertices);
		setTextureCoordinates(textureCoordinates);
    }
}
