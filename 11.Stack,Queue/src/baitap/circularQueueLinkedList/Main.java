package baitap.circularQueueLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution<Integer> intSolution = new Solution<>();
        intSolution.enQueue(10);
        intSolution.enQueue(20);
        intSolution.enQueue(30);
        intSolution.enQueue(40);
        intSolution.displayQueue();
        System.out.println(intSolution.deQueue().data);
        intSolution.displayQueue();
        System.out.println(intSolution.deQueue().data);
        intSolution.displayQueue();
        intSolution.enQueue(50);
        intSolution.displayQueue();
        System.out.println(intSolution.deQueue().data);
        intSolution.displayQueue();
        System.out.println(intSolution.deQueue().data);
        System.out.println("------------");
        intSolution.displayQueue();
    }
}
