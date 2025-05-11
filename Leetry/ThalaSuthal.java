package Leetry;

class ThalaSuthal {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] path=new int[rows*cols][2];
        path[rows*cols-1][0]=-1;
        pathMaker(rStart,cStart,rows-1,cols-1,1,path,0);
        return path;
    }
    public void pathMaker(int rp,int cp,int re,int ce,int step,int[][] path,int track){
        if(path[path.length-1][0]!=-1){
            return;
        }
        //right
        int save=cp;
        for(int i=cp;i<=save+step;i++){
            cp++;
            if(isValid(rp,i,re,ce)){
                path[track][0]=rp;
                path[track++][1]=i;
                
            }
        }
        rp++;

        //down
        save=rp;
        for(int i=rp;i<=save+step;i++){
            rp++;
            if(isValid(i,cp,re,ce)){
                path[track][0]=i;
                path[track++][1]=cp;
            }
        }
        cp--;

        //two steps done so increment the step value
        step++;

        //left
        save=cp;
        for(int i=cp;i>=save-step;i--){
            cp--;
            if(isValid(rp,i,re,ce)){
                path[track][0]=rp;
                path[track++][1]=i;
            }
        }
        rp--;

        //up
        save=rp;
        for(int i=rp;i>=save-step;i--){
            rp--;
            if(isValid(i,cp,re,ce)){
                path[track][0]=i;
                path[track++][1]=cp;
            }
        }
        cp++;

        // call it again
        pathMaker(rp,cp,re,ce,step,path,track);
    }

    public boolean isValid(int row,int col,int re,int ce){
        return row<=re&&row>=0&&col>=0&&col<=ce;
    }
}