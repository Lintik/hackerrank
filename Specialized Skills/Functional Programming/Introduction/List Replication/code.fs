open System

[<EntryPoint>]
let main args = 
    let inputs = 
        Seq.initInfinite (fun _ -> Console.ReadLine())
            |> Seq.takeWhile (fun s -> s <> null)
            |> Seq.map int
            |> List.ofSeq

    0