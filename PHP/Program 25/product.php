<html>
    <head>
        <title>Product</title>
    </head>
    <body>
        <?php
               $servername = "localhost";
               $db_username = "root";
               $db_password = "";
               $dbname = "mydb";
               $conn = mysqli_connect($servername,$db_username,$db_password,$dbname);
               if(!$conn) {
                   die("Connection Not Established");
               }
               $query = "INSERT INTO product VALUES (1,'Pencil',5),(2,'Pen',10),(3,'Eraser',3),(4,'Sharpner',4),(5,'Scale',5)";
               $result = mysqli_query($conn,$query);
               $sql = "SELECT * FROM product";
               $result = mysqli_query($conn, $sql);
                echo "<table border='1'>
                <tr>
                <th>Item Code</th>
                <th>Item Name</th>
                <th>Unit Price</th>
                </tr>";
                while ($row = mysqli_fetch_array($result)) {
                    echo "<tr>";
                    echo "<td>" . $row['itemcode'] . "</td>";
                    echo "<td>" . $row['itemname'] . "</td>";
                    echo "<td>" . $row['unitprice'] . "</td>";
                    echo "</tr>";
                }
                echo "</table>";
                mysqli_close($conn);
                ?>  
    </body>
</html>