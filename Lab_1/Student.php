<?php

// Another method for advanced level task that can be done with University too

class Student
{
    public $name;
    public $age;
    public $math_mark;
    public $physics_mark;
    public $oop_mark;
    public $db_mark;
}

$first_student = new Student();
$first_student->name = 'Mary';
$first_student->age = 20;
$first_student->math_mark = 9;
$first_student->physics_mark = 7;
$first_student->oop_mark = 10;
$first_student->db_mark = 10;

$second_student = new Student();
$second_student->name = 'Ally';
$second_student->age = 21;
$second_student->math_mark = 8;
$second_student->physics_mark = 9;
$second_student->oop_mark = 9;
$second_student->db_mark = 10;

$third_student = new Student();
$third_student->name = 'Chloe';
$third_student->age = 19;
$third_student->math_mark = 10;
$third_student->physics_mark = 8;
$third_student->oop_mark = 9;
$third_student->db_mark = 8;

echo "The name of the second student is: " . $second_student->name;
