<html>
    <head>
        <title>Account Table</title>
    </head>
    <body>
        <form method="post">
            <input type="number" name="account_no" placeholder="Account No"><br>
            <input type="text" name="name" placeholder="Name"><br>
            <input type="number" name="amount" placeholder="Amount"><br>
            Operation <br>
            Update <input type="radio" name="operation" value="update">
            Delete <input type="radio" name="operation" value="delete"><br><br>
            <button type="submit">Submit</button>
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
                $account_no = $_POST["account_no"];
                $name = $_POST["name"];
                $amount = $_POST["amount"];
                $operation = $_POST["operation"];
                if($operation == "update") {
                    mysqli_query($conn, "UPDATE account SET name='$name',amount=$amount WHERE account_no=$account_no");
                }
                if($operation == "delete") {
                    mysqli_query($conn, "DELETE FROM account WHERE account_no=$acount_no");
                }
              }
        
              $result = mysqli_query($conn, "SELECT * FROM account");
              echo "<table border='1'>";
              echo "<tr><th>Account Number</th><th>Name</th><th>Amount</th></tr>";
              while($row=mysqli_fetch_row($result)){
                echo "<tr><td>$row[0]</td><td>$row[1]</td><td>$row[2]</td></tr>";
              }
              echo "</table>";
              mysqli_close($conn);
        ?>
    </body>
</html>
