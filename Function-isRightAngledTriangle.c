int isRightAngleTriangle(struct Point *p1, struct Point *p2, struct Point *p3)
{
    int a=(p1->x-p2->x)*(p1->x-p2->x)+(p1->y-p2->y)*(p1->y-p2->y);
    int b=(p1->x-p3->x)*(p1->x-p3->x)+(p1->y-p3->y)*(p1->y-p3->y);
    int c=(p2->x-p3->x)*(p2->x-p3->x)+(p2->y-p3->y)*(p2->y-p3->y);
    if(b==a+c||a==b+c||c==a+b)
    {
        return 1;
    }
    return 0;
}
