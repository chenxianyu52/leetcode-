class H2O {

    private Semaphore hSema = new Semaphore(2);
    private Semaphore oSema = new Semaphore(0);


    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hSema.acquire();
        releaseHydrogen.run();
        oSema.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oSema.acquire(2);
        releaseOxygen.run();
        hSema.release(2);
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了84.22% 的Java用户
 * 内存消耗:42.5 MB,击败了15.15% 的Java用户
 */