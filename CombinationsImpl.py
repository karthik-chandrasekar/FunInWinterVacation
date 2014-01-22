#!/usr/bin/env python


class Combination:
#Contains methods for generating possible combinations from given lists
    
    def __init__(self):
        pass

    def combinations(self, list1, list2):
        # Returns all possible combitions of given two lists        

        if not list1 or not list2:
            return []

        result = []
        for a in list1:
            result.extend([(a,b) for b in list2])

        return result

    def combination_nlists(self, n_lists):
        # Returns all possible combinations of given n lists
        
        list_count = len(n_lists)
        if not n_lists or list_count<2:
            return []

        if not n_lists[0] or not n_lists[1]:
            return []

        result = []
        for a in n_lists[0]:
            result.extend([[a,b] for b in n_lists[1]])

        result = self.get_comb(n_lists, result, 2, list_count)
        
        return [tuple(a) for a in result]
        

    def get_comb(self, n_lists, result, index, list_count):
        #Utility function used for getting all possible combinations of given n lists      
      
        if not index<list_count:
            return  result
     
        if not n_lists[index]:
            return []
 
        new_result = []
        for comb in result:
            for a in n_lists[index]:
                temp_list = comb[:index]
                temp_list.append(a)
                new_result.append(temp_list)

        return self.get_comb(n_lists, new_result, index+1, list_count)

if __name__ == "__main__":
        com_obj = Combination()

        #Test cases for two lists
        print com_obj.combinations(['a', 'b', 'c'], ['1', '2'])
        print com_obj.combinations(['a', 'b', 'c'], [])
        print com_obj.combinations([], ['1', '2'])
        print com_obj.combinations([], [])

        #Test cases for N lists
        print com_obj.combination_nlists([['a', 'b', 'c'], [], ['A', 'B']])
        print com_obj.combination_nlists([['a', 'b'], [1], ['A', 'B']])
        print com_obj.combination_nlists([])
        print com_obj.combination_nlists([['a', 'b'], [1,2,3], ['A'], ['AA', 'BB', 'CC']])
       
