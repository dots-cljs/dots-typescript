(ns dots.typescript.class-like-declaration-base
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [class-like-declaration-base]
  (.-kind ^js class-like-declaration-base))

(defn name
  ^js [class-like-declaration-base]
  (.-name ^js class-like-declaration-base))

(defn type-parameters
  ^js [class-like-declaration-base]
  (.-typeParameters ^js class-like-declaration-base))

(defn heritage-clauses
  ^js [class-like-declaration-base]
  (.-heritageClauses ^js class-like-declaration-base))

(defn members
  ^js [class-like-declaration-base]
  (.-members ^js class-like-declaration-base))

(defn flags
  ^js [class-like-declaration-base]
  (.-flags ^js class-like-declaration-base))

(defn parent
  ^js [class-like-declaration-base]
  (.-parent ^js class-like-declaration-base))

(defn source-file
  ^js [class-like-declaration-base]
  (.getSourceFile ^js class-like-declaration-base))

(defn child-count
  (^js [class-like-declaration-base]
   (.getChildCount ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getChildCount ^js class-like-declaration-base source-file)))

(defn child-at
  (^js [class-like-declaration-base index]
   (.getChildAt ^js class-like-declaration-base index))
  (^js [class-like-declaration-base index source-file]
   (.getChildAt ^js class-like-declaration-base index source-file)))

(defn children
  (^js [class-like-declaration-base]
   (.getChildren ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getChildren ^js class-like-declaration-base source-file)))

(defn start
  (^js [class-like-declaration-base]
   (.getStart ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getStart ^js class-like-declaration-base source-file))
  (^js [class-like-declaration-base source-file include-js-doc-comment?]
   (.getStart ^js class-like-declaration-base source-file include-js-doc-comment?)))

(defn full-start
  ^js [class-like-declaration-base]
  (.getFullStart ^js class-like-declaration-base))

(defn get-end
  ^js [class-like-declaration-base]
  (.getEnd ^js class-like-declaration-base))

(defn width
  (^js [class-like-declaration-base]
   (.getWidth ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getWidth ^js class-like-declaration-base source-file)))

(defn full-width
  ^js [class-like-declaration-base]
  (.getFullWidth ^js class-like-declaration-base))

(defn leading-trivia-width
  (^js [class-like-declaration-base]
   (.getLeadingTriviaWidth ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getLeadingTriviaWidth ^js class-like-declaration-base source-file)))

(defn full-text
  (^js [class-like-declaration-base]
   (.getFullText ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getFullText ^js class-like-declaration-base source-file)))

(defn text
  (^js [class-like-declaration-base]
   (.getText ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getText ^js class-like-declaration-base source-file)))

(defn first-token
  (^js [class-like-declaration-base]
   (.getFirstToken ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getFirstToken ^js class-like-declaration-base source-file)))

(defn last-token
  (^js [class-like-declaration-base]
   (.getLastToken ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getLastToken ^js class-like-declaration-base source-file)))

(defn for-each-child
  (^js [class-like-declaration-base cb-node]
   (.forEachChild ^js class-like-declaration-base cb-node))
  (^js [class-like-declaration-base cb-node cb-node-array]
   (.forEachChild ^js class-like-declaration-base cb-node cb-node-array)))

(defn decorators
  ^js [class-like-declaration-base]
  (.-decorators ^js class-like-declaration-base))

(defn modifiers
  ^js [class-like-declaration-base]
  (.-modifiers ^js class-like-declaration-base))

(defn pos
  ^js [class-like-declaration-base]
  (.-pos ^js class-like-declaration-base))

(defn end
  ^js [class-like-declaration-base]
  (.-end ^js class-like-declaration-base))
