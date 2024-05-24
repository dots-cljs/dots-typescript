(ns dots.typescript.server.protocol.organize-imports-mode
  (:require ["typescript" :as typescript]))

(def all (.. typescript/server -protocol -OrganizeImportsMode -All))

(def sort-and-combine (.. typescript/server -protocol -OrganizeImportsMode -SortAndCombine))

(def remove-unused (.. typescript/server -protocol -OrganizeImportsMode -RemoveUnused))
