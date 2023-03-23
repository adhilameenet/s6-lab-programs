<html>
    <head>
        <title>Student Mark</title>
    </head>
    <body>
        <form method="post">
            <input type="number" placeholder="Enter your Roll Number" name="roll">
            <button type="submit">Check Result</button>
        </form>
        <?php
            $servername = "localhost";
            $dbusername = "root";
            $dbpassword = "";
            $dbname = "sample";
            $conn = mysqli_connect($servername,$dbusername,$dbpassword,$dbname);
            if(!$conn) {
                die("Connection Not Established");
            }
            if($_POST) {
                $roll = $_POST["roll"];
                $query = "SELECT * FROM student WHERE roll_no = '$roll'";
                $result = mysqli_query($conn,$query);
                $number_of_rows = mysqli_num_rows($result);
                if($number_of_rows == 1) {
                   $row = mysqli_fetch_row($result);
                   echo "<table border='1'>";
                   echo "<tr><th>Roll Number</th><td>$row[0]</td></tr>";
                   echo "<tr><th>Name</th><td>$row[1]</td></tr>";
                   echo "<tr><th>Mark</th><td>$row[2]</td></tr>";
                   echo "<tr><th>Grade</th><td>$row[3]</td></tr>";
                   echo "</table>";
                } else {
                    echo "Invalid Roll Number";
                }
            }
            mysqli_close($conn);    
        ?>
    </body>
</html>