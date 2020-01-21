let getpoint a =
    let a = Console.ReadLine().Split()
    (a.[0] |> double, a.[1] |> double)

[<EntryPoint>]
let main argv =
    let n = Console.ReadLine() |> int
    let points = [for i = 1 to n do yield getpoint 0]
    let rec GetArea1 (l: List<double * double>) i =
        if i < l.Length-1 then 
            (fst l.[i] * snd l.[i+1]) + GetArea1 l (i+1)
        else fst l.[i] * snd l.[0]
    let rec GetArea2 (l: List<double * double>) i =
        if i < l.Length-1 then
            (snd l.[i] * fst l.[i+1]) + GetArea2 l (i+1)
        else snd l.[i] * fst l.[0]
    let area = (GetArea1 points 0) - (GetArea2 points 0)
    Console.WriteLine(abs (area / 2.0))
    0