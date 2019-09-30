<?php

/** Task: Implement a program where you should create and and modify the following objects: university and student.
You should be able to create students that have name,
age and mark (from their courses) and also to create universities which have name,
foundationYear and a list of students created earlier. */

$university = (object) [
    'name' => 'TUM',
    'foundationYear' => 1964,
    'student1' => 'John',
    'student2' => 'Anne',
    'student3' => 'Mary'
];

$student = (object) [
    'name' => 'John',
    'age' => 20,
    'mathMark' => 9,
    'physicsMark' => 8,
    'oopMark' => 10
];


