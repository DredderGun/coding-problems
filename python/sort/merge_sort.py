def merge_sort(ar, start, end):
    ar_len = end - start + 1
    if ar_len < 0:
        raise Exception('Not correct ar_len')
    if ar_len == 1:
        return [ar[start]]
    if ar_len <= 2 and ar[start] <= ar[end]:
        return ar[start:end + 1]
    elif ar_len <= 2 and ar[start] > ar[end]:
        return [ar[end], ar[start]]

    mid = round((end + start) / 2)
    return merge(
        merge_sort(ar, start, mid),
        merge_sort(ar, mid + 1, end))


def merge(ar1, ar2):
    if ar1[len(ar1) - 1] <= ar2[0]:
        return ar1 + ar2
    if ar2[len(ar2) - 1] <= ar1[0]:
        return ar2 + ar1

    new_arr = []
    i, j = 0, 0
    while i < len(ar1) and j < len(ar2):
        if ar1[i] <= ar2[j]:
            new_arr.append(ar1[i])
            i += 1
        else:
            new_arr.append(ar2[j])
            j += 1

    if i < len(ar1):
        new_arr.extend(ar1[i:len(ar1)])
    if j < len(ar2):
        new_arr.extend(ar2[i:len(ar2)])

    return new_arr
