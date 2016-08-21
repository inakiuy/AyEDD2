/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Inaki
 */
public class Result {
    
    private final boolean findResult;
    private final int iterations;
    
    public Result(boolean findResult, int iterations){
        this.findResult = findResult;
        this.iterations = iterations;
    }

    /**
     * @return the findResult
     */
    public boolean isFindResult() {
        return findResult;
    }

    /**
     * @return the iterations
     */
    public int getIterations() {
        return iterations;
    }
    
}
