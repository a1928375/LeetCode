# LeetCode

1. twoSum: (1) Given an array of integers, return indices of the two numbers such that they add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

2. recoverRotatedSortedArray: Given a rotated sorted array, recover it to sorted array in-place.（Ascending）

3. ReverseWordsInString: (151) Given an input string, reverse the string word by word.

4. rotateString: Given a string(Given in the way of char array) and an offset, rotate the string by offset in place. (rotate from left to right).

5. search2DMatrixII: (74) Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

        Integers in each row are sorted from left to right.
        The first integer of each row is greater than the last integer of the previous row.

6. firstBadVersion: (278) You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad. Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad. You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

7. findPeakElement: (162) A peak element is an element that is greater than its neighbors. Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index. The array may contain multiple peaks, in that case return the index to any one of the peaks is fine. You may imagine that nums[-1] = nums[n] = -∞.

8. strStr: (28) Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

9. mergeSortedArray: (88) Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array. The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

10. searchInsertPosition: (35) Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.

11. search2DMatrix: (74) Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
                Integers in each row are sorted from left to right.
                The first integer of each row is greater than the last integer of the previous row.

12. BinarySearch: The concepts of binary search.

13. medianOfTwoSortedArrays: (4) There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)). You may assume nums1 and nums2 cannot be both empty.

14. searchInRotatedSortedArray: (33) Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]). You are given a target value to search. If found in the array return its index, otherwise return -1. You may assume no duplicate exists in the array. Your algorithm's runtime complexity must be in the order of O(log n).

15. PartitionArray: (561) Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

16. rotateString_LeetCodeVersion: (769) We are given two strings, A and B. A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

17. binaryTreeZigzagLevelTraversal: (103) Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

18. binaryTreeLevelOrderTraversal: (102) Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

19. searchRangeInBST: (700) Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

20. binaryTreePostorderTraversal: (145) Given a binary tree, return the postorder traversal of its nodes' values.

21. binaryTreePreorderTraversal: (144) Given a binary tree, return the preorder traversal of its nodes' values.

22. binaryTreeInorderTraversal: (94) Given a binary tree, return the inorder traversal of its nodes' values.

23. maximumDepthOfABinaryTree: (104) Given a binary tree, find its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node. Note: A leaf is a node with no children.

24. mergeSort: The concepts of merge sort.

25. binaryTreeMaximumPathSum: (124) Given a non-empty binary tree, find the maximum path sum. For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

26. insertAnElementInBST: (701) Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST. Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

27. searchBST: (700) Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

28. triangle: (120) Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

29. uniquePaths: (62) A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below). The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

30. uniquePathTwo: (63) A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below). The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below). Now consider if some obstacles are added to the grids.

31. climbingStairs: (70) You are climbing a stair case. It takes n steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

32. jumpGame: (55) Given an array of non-negative integers, you are initially positioned at the first index of the array. Each element in the array represents your maximum jump length at that position. Determine if you are able to reach the last index.

33. wordBreak: (139) Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. The same word in the dictionary may be reused multiple times in the segmentation. You may assume the dictionary does not contain duplicate words.

34. longestConsequtiveSequence: (128) Given an unsorted array of integers, find the length of the longest consecutive elements sequence. Your algorithm should run in O(n) complexity.

35. BSTIterator: (173) Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST. Calling next() will return the next smallest number in the BST.

36. balancedBT: (110) Given a binary tree, determine if it is height-balanced. For this problem, a height-balanced binary tree is defined as: a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

37. binaryTreeMaximumPathSum: (124) Given a non-empty binary tree, find the maximum path sum. For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

38. lowestCommonAncestor: (236) Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

39. minimumPathSum: (64) Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path. Note: You can only move either down or right at any point in time.

40. Pascal'sTriangle: (118) Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

41. backpackOne: Given n items with size Ai, an integer m denotes the size of a backpack. How full you can fill this backpack?

42. backpackTwo: There are n items and a backpack with size m. Given array A representing the size of each item and array V representing the value of each item. What's the maximum value can you put into the backpack? A[i], V[i], n, m are all integers. You cannot split an item. The sum size of the items you want to put into backpack cannot exceed m. Each item can only be picked up once.

43. maximumSubarray: (53) Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

44. backpackThree: Given n kinds of items, and each kind of item has an infinite number available. The i-th item has size A[i] and value V[i]. Also given a backpack with size m. What is the maximum value you can put into the backpack? You cannot divide item into small pieces. Total size of items you put into backpack cannot exceed m.

45. backpackFive: Given n items with size nums[i] which an integer array and all positive numbers. An integer target denotes the size of a backpack. Find the number of possible fill the backpack. Each item may only be used once.
