(ns dots.typescript.semicolon-class-element
  "For when we encounter a semicolon in a class declaration. ES6 allows these as class elements."
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [semicolon-class-element]
  (.-kind ^js semicolon-class-element))

(defn parent
  ^js [semicolon-class-element]
  (.-parent ^js semicolon-class-element))

(defn name
  ^js [semicolon-class-element]
  (.-name ^js semicolon-class-element))

(defn flags
  ^js [semicolon-class-element]
  (.-flags ^js semicolon-class-element))

(defn source-file
  ^js [semicolon-class-element]
  (.getSourceFile ^js semicolon-class-element))

(defn child-count
  (^js [semicolon-class-element]
   (.getChildCount ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getChildCount ^js semicolon-class-element source-file)))

(defn child-at
  (^js [semicolon-class-element index]
   (.getChildAt ^js semicolon-class-element index))
  (^js [semicolon-class-element index source-file]
   (.getChildAt ^js semicolon-class-element index source-file)))

(defn children
  (^js [semicolon-class-element]
   (.getChildren ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getChildren ^js semicolon-class-element source-file)))

(defn start
  (^js [semicolon-class-element]
   (.getStart ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getStart ^js semicolon-class-element source-file))
  (^js [semicolon-class-element source-file include-js-doc-comment?]
   (.getStart ^js semicolon-class-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [semicolon-class-element]
  (.getFullStart ^js semicolon-class-element))

(defn get-end
  ^js [semicolon-class-element]
  (.getEnd ^js semicolon-class-element))

(defn width
  (^js [semicolon-class-element]
   (.getWidth ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getWidth ^js semicolon-class-element source-file)))

(defn full-width
  ^js [semicolon-class-element]
  (.getFullWidth ^js semicolon-class-element))

(defn leading-trivia-width
  (^js [semicolon-class-element]
   (.getLeadingTriviaWidth ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getLeadingTriviaWidth ^js semicolon-class-element source-file)))

(defn full-text
  (^js [semicolon-class-element]
   (.getFullText ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getFullText ^js semicolon-class-element source-file)))

(defn text
  (^js [semicolon-class-element]
   (.getText ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getText ^js semicolon-class-element source-file)))

(defn first-token
  (^js [semicolon-class-element]
   (.getFirstToken ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getFirstToken ^js semicolon-class-element source-file)))

(defn last-token
  (^js [semicolon-class-element]
   (.getLastToken ^js semicolon-class-element))
  (^js [semicolon-class-element source-file]
   (.getLastToken ^js semicolon-class-element source-file)))

(defn for-each-child
  (^js [semicolon-class-element cb-node]
   (.forEachChild ^js semicolon-class-element cb-node))
  (^js [semicolon-class-element cb-node cb-node-array]
   (.forEachChild ^js semicolon-class-element cb-node cb-node-array)))

(defn pos
  ^js [semicolon-class-element]
  (.-pos ^js semicolon-class-element))

(defn end
  ^js [semicolon-class-element]
  (.-end ^js semicolon-class-element))
