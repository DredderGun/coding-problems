//package dev.avyguzov.stepik.alghorithms;
//
//import dev.avyguzov.stepik.alghorithms.task82b.Task82b;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class Task82bTest {
//    @Test
//    public void testSegments1() {
//        assertArrayEquals(new int[] {1, 3, 4, 5}, Task82b.solution(new long[]{5, 3, 4, 4, 2}));
//    }
//
//    @Test
//    public void testSegments2() {
//        assertArrayEquals(new int[] {1}, Task82b.solution(new long[]{0}));
//    }
//
//    @Test
//    public void testSegments3() {
//        assertArrayEquals(new int[] {5}, Task82b.solution(new long[]{1, 2, 3, 4, 5}));
//    }
//
//    @Test
//    public void testSegments4() {
//        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Task82b.solution(new long[]{5, 4, 3, 2, 1}));
//    }
//
//    @Test
//    public void testSegments5() {
//        assertArrayEquals(new int[] {2, 4, 5}, Task82b.solution(new long[]{1, 2, 1, 2, 1}));
//    }
//
//    @Test
//    public void testSegments6() {
//        assertArrayEquals(new int[] {1, 2, 4, 5, 8, 10}, Task82b.solution(new long[]{7, 6, 1, 6, 4, 1, 2, 4, 10, 1}));
//    }
//
//    @Test
//    public void testSegments7() {
//        assertArrayEquals(new int[] {1, 3, 4, 5}, Task82b.solution(new long[]{5, 3, 4, 4, 2, 5, 9}));
//    }
//
//    @Test
//    public void testSegments8() {
//        assertArrayEquals(new int[] {1, 7, 8, 9, 10, 11, 12}, Task82b.solution(new long[]{10, 3, 3, 3, 3, 2, 7, 7, 7, 7, 7, 7}));
//    }
//
////    @Test
////    public void testSegments9() {
////        Random rd = new Random();
////        long[] arr = new long[100000];
////        arr[0] = 999999999;
////        for (int i = 1; i < arr.length; i++) {
////            arr[i] = arr[i - 1] - 1;
////        }
//////        assertArrayEquals(new int[] {1, 7, 8, 9, 10, 11, 12}, Task82b.solution(arr));
////        assertEquals(new int[] {1, 7, 8, 9, 10, 11, 12}, Task82b.solution(arr).length);
////    }
//
//}
