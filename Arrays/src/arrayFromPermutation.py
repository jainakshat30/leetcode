def build_array(nums):
    ans = [0] * len(nums)
    for i in range(len(nums)):
        ans[i] = nums[nums[i]]
    return ans

# Example usage:
nums = [0, 2, 1, 5, 3, 4]
result = build_array(nums)
print(result)  # Output: [0, 1, 2, 4, 5, 3]