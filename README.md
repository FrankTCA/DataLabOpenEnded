# Data Lab Open Ended

This is what I did for the open-ended section of the Data, Data, Data lab for AP CSA.

What I did was I took bases spread across my Minecraft Server, their owners, and their x and z coordinates, and then attempted to perform a travelling-salesman style problem with them.

I wanted to determine the quickest way between all of the bases.

I used the Pythoagorean theorem, as well as quasirandom numbers to go through all options and determine the shortest distance to get between all bases.

If you're interested in actually seeing the bases and their locations, head over to https://infotoast.org/mcmap/. All icons with a house on them are players' bases.

I have released the actual executable jar file in Releases, so you can check that out.

Here's a summary of all the classes:
> **Start:** The main class, doesn't actually do much.
>
> **Base:** A class that includes the name of the owner, and the x and z coordinates of each base.
> 
> **Sort:** This class basically contains an array of 7 numbers. This is used to assist in ensuring that the same order is not repeated.
> 
> **Organization:** This class is basically a sort + the total length. Basically Sort is used before actually calculating it out, while Organization is used after.
> 
> **BaseList:** This is probably the most important class. This contains the list of all of the bases, as well as the methods for actually performing the processes required to find the shortest distance.

While something like this seems like it should require a lot of computing power, it actually doesn't, and it is able to perform all 7! scans of the data relatively quickly. This is especially shocking because Java isn't really known for being a fast language.