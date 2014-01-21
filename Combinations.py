#!/usr/bin/env python

import itertools

class Combination:
#Contains methods for generating possible combinations from given lists
    
    def __init__(self):
        pass

    def combinations(self, list1, list2):
        # Returns all possible combitions of given two lists        

        return list(itertools.product(list1, list2))

    def combination_nlists(self, n_lists):
        # Returns all possible combinations of given n lists
        
        return list(itertools.product(*n_lists))
        

if __name__ == "__main__":
        com_obj = Combination()

        #Test cases for two lists
        print com_obj.combinations(['a', 'b', 'c'], ['1', '2'])
        print com_obj.combinations(['a', 'b', 'c'], [])
        print com_obj.combinations([], ['1', '2'])
        print com_obj.combinations([], [])

        #Test cases for N lists
        print com_obj.combination_nlists([['a', 'b', 'c'], ['1', '2'], ['A', 'B']])
        print com_obj.combination_nlists([[], [], ['A', 'B']])
        print com_obj.combination_nlists([])
        print com_obj.combination_nlists([['a', 'b'], [1,2,3], ['A'], ['AA', 'BB', 'CC']])
       
