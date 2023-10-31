(ns dots.typescript.organize-imports-mode
  (:require ["typescript" :as typescript]))

(def all (.-All typescript/OrganizeImportsMode))

(def sort-and-combine (.-SortAndCombine typescript/OrganizeImportsMode))

(def remove-unused (.-RemoveUnused typescript/OrganizeImportsMode))
