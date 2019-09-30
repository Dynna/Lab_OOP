<?php

/* Task: In main program you should be able to create 3 universities
with some students in it and calculate the average media between them
and print the result in console. */

class University
{
    public $student1_mark;
    public $student2_mark;
    public $student3_mark;

    public function averageMedia($student1_mark, $student2_mark, $student3_mark) {
        $sum = $student1_mark + $student2_mark + $student3_mark;
        $division = 3;
        $result = $sum/$division;

        return $result;
    }
}

$utm = new University();

$usm = new University();

$uesm = new University();

echo "Average media for UTM: " . $utm->averageMedia(9.2, 8.7, 10);
echo "<br>";
echo "Average media for USM: " . $usm->averageMedia(8.5, 6, 7.1);
echo "<br>";
echo "Average media for UESM: " . $uesm->averageMedia(8.1, 9.4, 6);

