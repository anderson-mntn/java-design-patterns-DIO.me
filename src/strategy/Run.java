package strategy;

public class Run {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robot robot = new Robot();
        robot.setComportamento(normal); 
        robot.mover();
        robot.setComportamento(agressivo);
        robot.mover();
        //Ameaça encontrada:
        robot.setComportamento(defensivo);
        robot.mover();
        
    }
}
