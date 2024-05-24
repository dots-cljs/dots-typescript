(ns dots.typescript.program-update-level
  (:refer-clojure :exclude [update])
  (:require ["typescript" :as typescript]))

(def update
  "Program is updated with same root file names and options"
  (.-Update typescript/ProgramUpdateLevel))

(def root-names-and-update
  "Loads program after updating root file names from the disk"
  (.-RootNamesAndUpdate typescript/ProgramUpdateLevel))

(def full
  "Loads program completely, including:
    - re-reading contents of config file from disk
    - calculating root file names for the program
    - Updating the program"
  (.-Full typescript/ProgramUpdateLevel))
