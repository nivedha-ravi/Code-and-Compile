#include<stdio.h>
struct Student
{
  char name[101];
  char roll[11];
  char grade[3];
  float attendance;
};
int main()
{
  struct Student student;
  scanf("Name: %[^\n]\n", student.name);
  scanf("Roll: %s\n", student.roll);
  scanf("Grade: %s\n", student.grade);
  scanf("Attendance: %f", &student.attendance);
  printf("%s\n%s\n%s\n%.2f", student.name, student.roll, student.grade,student.attendance);
  return 0;
}
