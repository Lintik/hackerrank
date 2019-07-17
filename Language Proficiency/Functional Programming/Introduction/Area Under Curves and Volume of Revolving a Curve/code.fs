open System

let f aVals bVals x =
    List.zip aVals bVals
    |> List.map (fun (a,b) -> a * pown x b)
    |> List.sum 

let area aVals bVals a b =
    let delta = 0.001
    let rec areaR p acc =
        match p with
        | p when p > b -> acc
        | _ ->
            let f' = delta * f aVals bVals p
            //printfn "p=%f; f=%f; acc=%f" p f' acc
            areaR (p + delta) (acc + f')
    areaR a 0.0

let volume aVals bVals a b =
    let delta = 0.001
    let PI = 3.141592653589
    let rec volR p acc =
        match p with
        | p when p >= b -> acc
        | _ ->
            let f' = (pown (f aVals bVals p) 2) * PI * delta
            //printfn "p=%f; f=%f; acc=%f" p f' acc
            volR (p + delta) (acc + f')
    volR a 0.0

[<EntryPoint>]
let main argv = 
    let x = 
        stdin.ReadLine().Split(' ')
        |> Array.map float
        |> Array.toList

    let p = 
        stdin.ReadLine().Split(' ')
        |> Array.map int
        |> Array.toList
    
    let ab =
        stdin.ReadLine().Split(' ')
        |> Array.map float
    let a, b = ab.[0], ab.[1]

    printfn "%.1f" <| area x p a b
    printfn "%.1f" <| volume x p a b

    0
