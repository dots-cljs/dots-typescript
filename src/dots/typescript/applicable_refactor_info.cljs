(ns dots.typescript.applicable-refactor-info
  "A set of one or more available refactoring actions, grouped under a parent refactoring."
  (:refer-clojure :exclude [name]))

(defn name
  "The programmatic name of the refactoring"
  ^js [applicable-refactor-info]
  (.-name ^js applicable-refactor-info))

(defn set-name!
  "The programmatic name of the refactoring"
  ^js [applicable-refactor-info value]
  (set! (.-name ^js applicable-refactor-info) value))

(defn description
  "A description of this refactoring category to show to the user.
   If the refactoring gets inlined (see below), this text will not be visible."
  ^js [applicable-refactor-info]
  (.-description ^js applicable-refactor-info))

(defn set-description!
  "A description of this refactoring category to show to the user.
   If the refactoring gets inlined (see below), this text will not be visible."
  ^js [applicable-refactor-info value]
  (set! (.-description ^js applicable-refactor-info) value))

(defn inlineable?
  "Inlineable refactorings can have their actions hoisted out to the top level
   of a context menu. Non-inlineanable refactorings should always be shown inside
   their parent grouping.
   
   If not specified, this value is assumed to be 'true'"
  ^js [applicable-refactor-info]
  (.-inlineable ^js applicable-refactor-info))

(defn set-inlineable!
  "Inlineable refactorings can have their actions hoisted out to the top level
   of a context menu. Non-inlineanable refactorings should always be shown inside
   their parent grouping.
   
   If not specified, this value is assumed to be 'true'"
  ^js [applicable-refactor-info value]
  (set! (.-inlineable ^js applicable-refactor-info) value))

(defn actions
  ^js [applicable-refactor-info]
  (.-actions ^js applicable-refactor-info))

(defn set-actions!
  ^js [applicable-refactor-info value]
  (set! (.-actions ^js applicable-refactor-info) value))
