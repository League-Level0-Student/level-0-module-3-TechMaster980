int x1 = 149;
int x2 = 349;
void setup(){
  size(500,500);
  noFill();
  
}
void draw(){
background(201,201);
for(int i = 10; i>0; i--){
ellipse(x1, 250, 15*i, 15*i);
}
x1++;

for(int i = 10; i>0; i--){
ellipse(x2, 250, 15*i, 15*i);
}

x2--;


}