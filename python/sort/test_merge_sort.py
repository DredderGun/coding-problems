from unittest import TestCase

from python.stepik.alghorithms.devideAndConquer import merge_sort


class Test(TestCase):
    def test_simple1(self):
        ar = [8, 4, 2, 1, 2, 7, 3, 1, 6, 5]
        self.assertEqual([1, 1, 2, 2, 3, 4, 5, 6, 7, 8], merge_sort(ar, 0, len(ar) - 1))

    def test_simple2(self):
        ar = [1]
        self.assertEqual([1], merge_sort(ar, 0, len(ar) - 1))

    def test_simple3(self):
        ar = [1, 3]
        self.assertEqual([1, 3], merge_sort(ar, 0, len(ar) - 1))

    def test_simple4(self):
        ar = [3, 1]
        self.assertEqual([1, 3], merge_sort(ar, 0, len(ar) - 1))
