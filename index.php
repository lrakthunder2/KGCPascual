<?php
$conn = mysqli_connect("localhost", "root","","employee"); 

if(!$conn){
    echo 'Connection error: ' . mysqli_connect();}
else{
 /*       print "database connected"; */
    }
$EmpID=0;$FName = "";$EmpLName = "";$EmpDept = "";$EmpPos = "";
?>

<!DOCTYPE html>
<html>
<link rel="stylesheet" a href="css/bootstrap.css"/>
<script src="js/bootstrap.js"/>
<head>
<title>Creative Colorlib SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
</head>
<body>

    <div class="main-w3layouts wrapper">
        <h1>Enter Employee Details</h1>
        <div class="main-agileinfo">
            <div class="agileits-top">
                <form action="#" method="post">
                    <input class="text" type="text" name="EmpID" id="$EmpID" placeholder="ID Number" required="">
                    <input class="text email" type="text" name="FName" id="$FName" placeholder="First Name" required="">
                    <input class="text" type="text" name="EmpLName" id="$EmpLName" placeholder="Last Name" required="">
                    <input class="text w3lpass" type="text" name="EmpDept" id="$EmpDept" placeholder="Department" required="">
                    <input class="text w3lpass" type="text" name="EmpPos" id="$EmpPos" placeholder="Position" required="">
                    <input type="submit" value="Add New Employee" name="add" id="add" value="true">
                    <?php
/*                  $EmpID = isset(EmpID);                   */

       if((isset($_POST['add'])))
        {
            $EmpID = $_POST['EmpID'];
            $FName = $_POST['FName'];
            $EmpLName = $_POST['EmpLName'];
            $EmpDept = $_POST['EmpDept'];
            $EmpPos = $_POST['EmpPos'];

                    $sql = "INSERT INTO emp (EmpID, EmpFName, EmpLName, EmpDept, EmpPos) 
                            VALUES ('$EmpID', '$FName','$EmpLName','$EmpDept','$EmpPos')";

                    if ($conn->query($sql) === TRUE) {
                    echo "New record created successfully";
                    } else {
                    echo "Error: " . $sql . "<br>" . $conn->error;
                    }
        }           ?>
                </form>
            </div>
        </div>
<!-- displays bubbles hahaha depends on how many <li></li> -->        
        <ul class="colorlib-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</body>
</html>