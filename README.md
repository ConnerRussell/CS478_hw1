# Standard Homework Workflow

## Get the homework
- Open the homework url.
- Accept the assignment.
- Open your repo.
- Copy the clone url to your clipboard.  
- Open Git Bash and type the following command:
<pre>
  git clone <i>pasted-url</i>    # paste in the copied url using Shift-Ins
</pre>

## Work on the homework
- Type the following commands in Git Bash:
<pre>
  cd <i>new-repo-directory</i>
  sbt ~run
</pre>
- Open the Scala file in an editor and work on the problems.  
- When you save the file, it will automatically compile and run
  in the Git Bash window. Continue to edit and save until done.  
- Hit `Enter` to quit the `~run` session.
- **Don't forget to include any necessary documentation as inline comments!**
- When you finish a problem, or need to stop working for a while, I recommend saving your work using:
<pre>
  git add .
  git commit -m "<i>some message</i>"   # eg, "finished problem 1"
  git push
</pre>

## Turn it in
- Type the following commands in Git Bash:
<pre>
  sbt clean run > output.txt
  git add .
  git commit -m "Turnin"
  git push
</pre>
- Open the repo on GitHub.
- Click on **New pull request** button.
- Click on **base: master** and select **original** in the dropdown.
- Type **Turnin** as the subject line (if it's not there already).
- Scroll down and click on **Create pull request**.
