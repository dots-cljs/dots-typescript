(ns dots.typescript.doc-comment-template-options)

(defn generate-return-in-doc-template?
  ^js [doc-comment-template-options]
  (.-generateReturnInDocTemplate ^js doc-comment-template-options))
