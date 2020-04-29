"""input:
  abc_der
 output:
 cba_der

 input:
  asdddad
 output:
  asdddad
  """
string=input()
if '_' not in string:
    print(string[::-1])
elif string.index('_')==0:
    print(string)
else:
    if string.index('_')==len(string):
        x,y=string.split("_")
        print(x[::-1])
    else:
        a,c=string.split("_")
        print(a[::-1]+"_"+c)
