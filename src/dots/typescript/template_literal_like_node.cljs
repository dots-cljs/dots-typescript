(ns dots.typescript.template-literal-like-node)

(defn raw-text
  ^js [template-literal-like-node]
  (.-rawText ^js template-literal-like-node))

(defn set-raw-text!
  ^js [template-literal-like-node value]
  (set! (.-rawText ^js template-literal-like-node) value))

(defn text
  ^js [template-literal-like-node]
  (.-text ^js template-literal-like-node))

(defn set-text!
  ^js [template-literal-like-node value]
  (set! (.-text ^js template-literal-like-node) value))

(defn unterminated?
  ^js [template-literal-like-node]
  (.-isUnterminated ^js template-literal-like-node))

(defn set-is-unterminated!
  ^js [template-literal-like-node value]
  (set! (.-isUnterminated ^js template-literal-like-node) value))

(defn has-extended-unicode-escape?
  ^js [template-literal-like-node]
  (.-hasExtendedUnicodeEscape ^js template-literal-like-node))

(defn set-has-extended-unicode-escape!
  ^js [template-literal-like-node value]
  (set! (.-hasExtendedUnicodeEscape ^js template-literal-like-node) value))

(defn kind
  ^js [template-literal-like-node]
  (.-kind ^js template-literal-like-node))

(defn flags
  ^js [template-literal-like-node]
  (.-flags ^js template-literal-like-node))

(defn parent
  ^js [template-literal-like-node]
  (.-parent ^js template-literal-like-node))

(defn source-file
  ^js [template-literal-like-node]
  (.getSourceFile ^js template-literal-like-node))

(defn child-count
  (^js [template-literal-like-node]
   (.getChildCount ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getChildCount ^js template-literal-like-node source-file)))

(defn child-at
  (^js [template-literal-like-node index]
   (.getChildAt ^js template-literal-like-node index))
  (^js [template-literal-like-node index source-file]
   (.getChildAt ^js template-literal-like-node index source-file)))

(defn children
  (^js [template-literal-like-node]
   (.getChildren ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getChildren ^js template-literal-like-node source-file)))

(defn start
  (^js [template-literal-like-node]
   (.getStart ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getStart ^js template-literal-like-node source-file))
  (^js [template-literal-like-node source-file include-js-doc-comment?]
   (.getStart ^js template-literal-like-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-literal-like-node]
  (.getFullStart ^js template-literal-like-node))

(defn get-end
  ^js [template-literal-like-node]
  (.getEnd ^js template-literal-like-node))

(defn width
  (^js [template-literal-like-node]
   (.getWidth ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getWidth ^js template-literal-like-node source-file)))

(defn full-width
  ^js [template-literal-like-node]
  (.getFullWidth ^js template-literal-like-node))

(defn leading-trivia-width
  (^js [template-literal-like-node]
   (.getLeadingTriviaWidth ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getLeadingTriviaWidth ^js template-literal-like-node source-file)))

(defn full-text
  (^js [template-literal-like-node]
   (.getFullText ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getFullText ^js template-literal-like-node source-file)))

(defn get-text
  (^js [template-literal-like-node]
   (.getText ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getText ^js template-literal-like-node source-file)))

(defn first-token
  (^js [template-literal-like-node]
   (.getFirstToken ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getFirstToken ^js template-literal-like-node source-file)))

(defn last-token
  (^js [template-literal-like-node]
   (.getLastToken ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getLastToken ^js template-literal-like-node source-file)))

(defn for-each-child
  (^js [template-literal-like-node cb-node]
   (.forEachChild ^js template-literal-like-node cb-node))
  (^js [template-literal-like-node cb-node cb-node-array]
   (.forEachChild ^js template-literal-like-node cb-node cb-node-array)))

(defn pos
  ^js [template-literal-like-node]
  (.-pos ^js template-literal-like-node))

(defn end
  ^js [template-literal-like-node]
  (.-end ^js template-literal-like-node))
