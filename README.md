# PerfectMap
A web application interfaced with Google Map API. EC504 Data Structure Project.

Hello, here is team King Wah Ham. Our members are Haomiao Yu, Qihong Xu and Tao Liu. This is a brief description of how to compile and run the project code.

1. Import the project into your Java IDE. Eclipse is higly recommended. 
2. Make sure your Java JDK and JRE are updated.
3. Compile class PowerMap in your IDE. You should be able to see a small window saying that 'Applet started.'.
	WARNING: Please note that compiling the program may result in files lost in folder 'bin'!!!!!!!!!!!!!!!!!!!!!!!!
4. Open the html file 'map.html' inside folder 'bin'.
5. Click 'Run' if any windows occur. If fails, add the address of the html file shown on the browser to your Java trust list in Control Panel.
5. You can see a very cool fallout-pipboy-like UI. Now you can: 
	1) Load your map data using the 'DATA' button.
	2) Double-click to locate a certain point.
	3) Click 'MAP' button to find the nearest 10 points of your chosen location.
	4) Click the 'POWER' button to clear all the marker on the map.
	5) Hold 'Shift' and drag your mouse to make a rectangle. Points inside the rectangle will be shown.
	6) Click the marker of a location will show its state and city. In KNN, distance will also be shown.
6. Enjoy playing with it.

Files include:

Point.java
	Defination of class point used to define each point on the map.
PowerMap.java
	Applet and main function. Have initialization, knn, range function.
map.html
	UI of the MapApp.
*png
	image used in the UI.
