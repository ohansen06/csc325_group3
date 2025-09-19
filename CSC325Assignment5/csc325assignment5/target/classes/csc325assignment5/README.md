
Structure:
GUI is controlled mainly through the DrawController class. This makes it easy to manage events and keep the layout under one class. The logic and methods for shapes are kept in specific classes for each shape that also implement the DrawableShape interface.
Reusable Patterns: 
The use of a DrawableShape interface makes adding new shape classes easy in the future. Having this interface and the draw() method that each shape class shares makes it easier to use the draw() method in DrawController without having to rewrite much code. 
(LVL 3)
Features:
With this program you have the ability to draw shapes (either a rectangle or a circle) of a fixed size to a canvas. You can draw as many of these shapes as you want while also keeping a live count. The canvas is also able to be cleared, then reseting the count as well. The actual code utilizes polymorphism and clear patterns that make it easy to add more shapes later on.
How to Compile and Run (VSCode):
-Ensure that Java and Maven for Java extensions are installed in VSCode
-Make sure that the pom.xml includes the nessecary JavaFX dependencies
-Run in VSCode
Levels Completed:
Up to LVL 3 has been completed (without any extras) and no AI was used for this assignment.
