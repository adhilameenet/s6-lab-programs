<html>
    <head>
        <title>Program 28</title>
    </head>
    <body>
        <?php
            $names = array("Raju","Ramu","Alex","John","Joe","Doe","Alex","John","Peter","Greffin");
            echo "Names are :";
            foreach($names as $name) {
                echo "$name ";
            }
            sort($names);
            echo "<br>";
            echo "Sorted Names are :";
            foreach($names as $name) {
                echo "$name ";
            }
            $unique_names = array_unique($names);
            echo "<br>";
            echo "Unique Names are :";
            foreach($unique_names as $name) {
                echo "$name ";
            }
            $last = array_pop($names);
            echo "<br>";
            echo "Last Removed Name : $last" ;
           
            $names_reversed = array_reverse($names);
            echo "<br>";
            echo "Names in Reverse Order :";
            foreach($names_reversed as $name) {
                echo "$name ";
            }
            $index = array_search("Alex", $names);
            echo "<br>";
            echo "Alex found at $index";
        ?>
    </body>
</html>
