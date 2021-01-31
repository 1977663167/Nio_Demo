package test;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

/**
 * 一维并查集
 *
 * @author 高才
 * @date 2021/1/31 23:09
 **/
public class Solution {
    public static void main(String[] args) {
        int i = numSimilarGroups(new String[]{"tars", "rats", "arts", "star"});
        System.out.println("i = " + i);
    }
    public static int numSimilarGroups(String[] strs) {
        int n=strs.length;
        UnionFind uf=new UnionFind(n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected(strs[i],strs[j])){
                    uf.unionSet(i,j);
                }
            }
        }
        return uf.count();
    }
    public static boolean isConnected(String str1,String str2){
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                count++;
            }
        }
        return count==2||count==0?true:false;
    }
}
class UnionFind{
    int[] parent;
    int[] rank;
    public UnionFind(int n){
        this.parent=new int[n];
        this.rank=new int[n];
        Arrays.fill(this.parent,-1);
        Arrays.fill(this.rank,1);
    }
    public int findRoot(int x){
        int root=x;
        while(this.parent[root]!=-1){
            root=this.parent[root];
        }
        return root;
    }
    public boolean unionSet(int x,int y){
        int xRoot=this.findRoot(x);
        int yRoot=this.findRoot(y);
        if(xRoot==yRoot){
            return false;
        }
        if(this.rank[xRoot]>this.rank[yRoot]){
            this.parent[yRoot]=xRoot;
        }else if(this.rank[xRoot]<this.rank[yRoot]){
            this.parent[xRoot]=yRoot;
        }else{
            this.parent[yRoot]=xRoot;
            rank[xRoot]++;
        }
        return true;
    }
    public int count(){
        int countSet=0;
        for(int i=0;i<this.parent.length;i++){
            if(this.parent[i]==-1){
                countSet++;
            }
        }
        return countSet;
    }
}
