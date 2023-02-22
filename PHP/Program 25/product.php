<html>
    <head>
        <title>Product</title>
    </head>
    <body>
        <form method="post">
            <input type="number" name="itemcode" placeholder="Item Code">
            <input type="text" name="itemname" placeholder="Item Name">
            <input type="number" name="unitprice" placeholder="Unit Price">
            <button type="submit">Add</button>
        </form>
        <?php
              if($_POST) {
                $servername = "localhost";
                $db_username = "root";
                $db_password = "";
                $dbname = "mydb";
                $conn = mysqli_connect($servername,$db_username,$db_password,$dbname);
                if(!$conn) {
                    die("Connection Not Established");
                }
                $itemcode = $_POST["itemcode"];
                $itemname = $_POST["itemname"];
                $unitprice = $_POST["unitprice"];
 
                $query = "INSERT INTO product (itemcode,itemname,unitprice) VALUES ('$itemcode','$itemname','$unitprice')";
                $result = mysqli_query($conn,$query);
                $sql = "SELECT * FROM product";
                $result = mysqli_query($conn, $sql);
                 echo "Products <hr>";
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
              }
            ?>  
    </body>
</html>
