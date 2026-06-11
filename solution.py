# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorder(self, root, arr):
        if not root:
            return
        
        self.inorder(root.left, arr)
        arr.append(root.val)
        self.inorder(root.right, arr)

    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        arr = []
        self.inorder(root, arr)

        dif = 99999999
        for i in range(len(arr) - 1):
            dif = min(dif, arr[i + 1] - arr[i])
        
        if dif != 99999999:
            return dif
        else:
            return 0
