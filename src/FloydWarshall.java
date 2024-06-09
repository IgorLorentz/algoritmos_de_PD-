public class FloydWarshall {
    public void FloydWarshall(int caminho[][], int v){
        for(int k = 0; k < v; k++){
            for(int i = 0; i < v; i++){
                for(int j = 0; j < v; j++){
                    if(caminho[i][j] > caminho[i][k] + caminho [j][k]){
                        caminho[i][j] =  caminho[i][k] + caminho[j][k];
                    }
                }
            }

        }
    }
}
