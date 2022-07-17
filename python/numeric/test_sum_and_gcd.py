from unittest import TestCase

from python.numeric.sum_and_gcd import gcd, compute


class Test(TestCase):
    def test_gcd(self):
        self.assertEqual(1, gcd(50, 27))

    def test_gcd1(self):
        self.assertEqual(2, gcd(11506, 430))

    def test_compute(self):
        self.assertEqual([7, 28], compute(35))

    def test_compute1(self):
        self.assertEqual([10010257, 100102570], compute(110112827))

    def test_compute2(self):
        self.assertEqual([1, 10010256], compute(10010257))

    def test_compute3(self):
        self.assertEqual([268435456, 268435456], compute(536870912))

    def test_compute4(self):
        self.assertEqual([7, 28], compute(35))

    def test_compute5(self):
        self.assertEqual([1, 982451652], compute(982451653))
